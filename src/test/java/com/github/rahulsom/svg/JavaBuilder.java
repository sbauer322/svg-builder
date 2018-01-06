package com.github.rahulsom.svg;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class JavaBuilder {
    public static String createSvg() throws JAXBException {
        ObjectFactory objectFactory = new ObjectFactory();
        Svg svg = objectFactory.createSvg().
                withHeight("3").
                withWidth("7").
                withSVGDescriptionClassOrSVGAnimationClassOrSVGStructureClass(
                        objectFactory.createCircle(
                                objectFactory.createCircle()
                        ),
                        objectFactory.createA(
                                objectFactory.createSVGHyperlinkClass()
                        )
                );
        StringWriter writer = new StringWriter();
        Marshaller marshaller = JAXBContext.newInstance(Svg.class).createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(svg, writer);
        return writer.toString();
    }
}
