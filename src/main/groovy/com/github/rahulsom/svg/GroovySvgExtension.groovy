package com.github.rahulsom.svg

import groovy.transform.CompileStatic

import java.util.function.Consumer

@CompileStatic
class GroovySvgExtension {
    static <T extends SVGSvgContent> T content(T self, Consumer<Context> consumer) {
        Context context = new Context()
        consumer.accept(context)
        self.withSVGDescriptionClassOrSVGAnimationClassOrSVGStructureClass(context.things)
        return self
    }
}
