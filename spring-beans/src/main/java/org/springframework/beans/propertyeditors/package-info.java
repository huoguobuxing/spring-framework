/**
 * Properties editors used to convert from String values to object
 * types such as java.util.Properties.
 *
 * 属性编辑器，用来将字符串类型转换为Object类型
 *
 * <p>Some of these editors are registered automatically by BeanWrapperImpl.
 * "CustomXxxEditor" classes are intended for manual registration in
 * specific binding processes, as they are localized or the like.
 * 
 *  BeanWrapperImpl 提供了默认实现，部分可以手动注册
 * 
 */
@NonNullApi
@NonNullFields
package org.springframework.beans.propertyeditors;

import org.springframework.lang.NonNullApi;
import org.springframework.lang.NonNullFields;
