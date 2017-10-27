package xzp.xf.pro.impl.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 常用工具类
 * Created by zbk.
 * E-mail: zhangbk@hyxt.com
 * Date: 2015/10/12
 */
public class BeanUtils {
    /**
     * 获取对象属性，返回一个字符串数组
     *
     * @param o 对象
     * @return String[] 字符串数组
     */
    public static String[] getFiledName(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }

    /**
     * 将一个Map对象转化为一个Bean.
     * 说明：只针对有一级属性的bean
     *
     * @param map   待转换的Map
     * @param clazz 转换后的Bean
     * @return 转换出来的Bean
     */
    public static <T> T convertMapToBean(Map<String, T> map, Class<T> clazz) throws IntrospectionException, IllegalAccessException, InstantiationException, InvocationTargetException {
        BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
        T obj = clazz.newInstance();
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        int len = propertyDescriptors.length;
        String propertyName = "";
        PropertyDescriptor descriptor = null;
        for (int i = 0; i < len; i++) {
            descriptor = propertyDescriptors[i];
            propertyName = descriptor.getName();
            if (map.containsKey(propertyName)) {
                Object value = map.get(propertyName);
                Object[] args = new Object[1];
                args[0] = value;
                descriptor.getWriteMethod().invoke(obj, args);
            }
        }
        return obj;
    }

    /**
     * 将一个Bean对象转化为一个Map.
     * 说明：只针对有一级属性的bean
     *
     * @param bean 要转化的Bean对象
     * @return 转化出来的Map对象
     * @throws IntrospectionException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public static Map<String,Object> convertBeanToMap(Object bean) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        Class type = bean.getClass();
        Map<String,Object> returnMap = new HashMap<String,Object>();
        BeanInfo beanInfo = Introspector.getBeanInfo(type);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        PropertyDescriptor descriptor = null;
        int len = propertyDescriptors.length;
        String propertyName = "";
        for (int i = 0; i < len; i++) {
            descriptor = propertyDescriptors[i];
            propertyName = descriptor.getName();
            if (!propertyName.equals("class")) {
                Method readMethod = descriptor.getReadMethod();
                Object result = readMethod.invoke(bean);
                if (result != null) {
                    returnMap.put(propertyName, result);
                } else {
                    returnMap.put(propertyName, null);
                }
            }
        }
        return returnMap;
    }

    /**
     * json格式转换为bean对象
     *
     * @param json  json字符串
     * @param clazz bean对象
     * @return
     * @throws IOException
     */
    public static <T> T json2Bean(String json, Class<T> clazz) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(json, clazz);
    }


	/*public static <T,E extends Enum> T json2BeanWithEnums(String json, Class<T> clazz,final Class<E>... enums) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		SimpleModule module = new SimpleModule();
		for(final Class<E> e:enums){
			module.addDeserializer(e, new JsonDeserializer<E>() {
				@Override
				public E deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
					JsonNode node = p.getCodec().readTree(p);
					String name = node.get("name").asText();
					return Enum.valueOf(e,name);
				}
			});
			mapper.registerModule(module);
		}
		module.addDeserializer(Enum.class, new JsonDeserializer<Enum>() {
			@Override
			public Enum deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
				JsonNode node = p.getCodec().readTree(p);
				return null;
			}
		});
        mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,false);
		mapper.registerModule(module);
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
		return mapper.readValue(json, clazz);
	}*/


	/**
     * bean对象转换为json字符串
     *
     * @param bean bean对象
     * @return
     * @throws Exception
     */
    public static String bean2Json(Object bean) throws Exception {
        return null == bean ? null : new ObjectMapper().writeValueAsString(bean);
    }
}
