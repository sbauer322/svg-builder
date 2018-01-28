package com.github.rahulsom.svg

import java.io.StringWriter
import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller

object KotlinBuilder {

    @JvmStatic
    fun createSvg(): String {
        val svg = Svg().withHeight("3").withWidth("7")
            .content {
                add(Circle())
                add(SVGHyperlinkClass())
            }
        val writer = StringWriter()
        val marshaller = JAXBContext.newInstance(Svg::class.java).createMarshaller()
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, java.lang.Boolean.TRUE)
        marshaller.marshal(svg, writer)
        return writer.toString()
    }

}