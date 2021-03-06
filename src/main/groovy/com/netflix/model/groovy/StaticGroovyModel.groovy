package com.netflix.model.groovy

import groovy.transform.CompileStatic
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@TupleConstructor
@EqualsAndHashCode
@ToString
@CompileStatic
class StaticGroovyModel {
    Integer integer
    List<String> list
    String str1
    String str2
    String str3
    String str4
    String str5
    String str6
    Double doub
}
