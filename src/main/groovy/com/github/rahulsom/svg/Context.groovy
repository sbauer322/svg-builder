package com.github.rahulsom.svg

import groovy.transform.CompileStatic

import javax.xml.bind.JAXBElement

@CompileStatic
class Context {
    List<JAXBElement> things = new ArrayList<>();

    boolean leftShift(Object object) {
        def factory = new ObjectFactory()
        def method = factory.metaClass.methods.find {
            it.returnType == JAXBElement &&
                    it.parameterTypes.length == 1 &&
                    it.parameterTypes[0].isAssignableFrom(object.class) &&
                    it.parameterTypes[0].name != 'java.lang.Object'
        }

        println method

        things.add(method.invoke(factory, [object] as Object[]) as JAXBElement)
    }
}
