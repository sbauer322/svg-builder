package com.github.rahulsom.svg

import groovy.transform.CompileStatic

import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller

@CompileStatic
@NewifySvg
class GroovyBuilder {

	static String createSvg() {
		def retval =
				Svg(height: '3', width: '7').content {
					it << Circle()
					it << SVGHyperlinkClass()
				}

		StringWriter writer = new StringWriter()
		Marshaller marshaller = JAXBContext.newInstance(Svg).createMarshaller()
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE)
		marshaller.marshal(retval, writer)
		writer.toString()
	}
}
