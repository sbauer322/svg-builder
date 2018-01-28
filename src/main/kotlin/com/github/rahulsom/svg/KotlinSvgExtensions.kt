package com.github.rahulsom.svg

inline fun <T : SVGSvgContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClassOrSVGAnimationClassOrSVGStructureClass(context.things)
    return this
}

inline fun <T : SVGDefsContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClassOrSVGAnimationClassOrSVGStructureClass(context.things)
    return this
}

inline fun <T : SVGAnimateColorContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGAnimateContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGAnimateMotionContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGAnimateTransformContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGCircleContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGClipPathContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGColorProfileContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGCursorContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGEllipseContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGFilterContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGFontContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGFontFaceContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGGContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClassOrSVGAnimationClassOrSVGStructureClass(context.things)
    return this
}

inline fun <T : SVGGlyphContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClassOrSVGAnimationClassOrSVGStructureClass(context.things)
    return this
}

inline fun <T : SVGImageContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGLineContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGLinearGradientContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGMarkerContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClassOrSVGAnimationClassOrSVGStructureClass(context.things)
    return this
}

inline fun <T : SVGMaskContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClassOrSVGAnimationClassOrSVGStructureClass(context.things)
    return this
}

inline fun <T : SVGMissingGlyphContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClassOrSVGAnimationClassOrSVGStructureClass(context.things)
    return this
}

inline fun <T : SVGMpathContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGPathContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGPatternContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClassOrSVGAnimationClassOrSVGStructureClass(context.things)
    return this
}

inline fun <T : SVGPolygonContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGPolylineContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGRadialGradientContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGRectContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGSetContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGSwitchContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGSymbolContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClassOrSVGAnimationClassOrSVGStructureClass(context.things)
    return this
}

inline fun <T : SVGTrefContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withAnimateOrSetOrAnimateColor(context.things)
    return this
}

inline fun <T : SVGUseContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}

inline fun <T : SVGViewContent> T.content(consumer: KotlinContext.() -> Unit): T {
    val context = KotlinContext()
    consumer(context)
    this.withSVGDescriptionClass(context.things)
    return this
}