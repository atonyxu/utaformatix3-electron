package ui

import csstype.NamedColor
import emotion.react.css
import mui.material.Link
import mui.material.LinkUnderline
import mui.material.Typography
import mui.material.TypographyAlign
import mui.material.styles.TypographyVariant
import react.FC
import react.Props
import react.dom.html.AnchorTarget
import react.dom.html.ReactHTML.footer
import ui.strings.Strings

val CustomFooter = FC<CustomFooterProps> { props ->
    footer {
        Typography {
            align = TypographyAlign.center
            variant = TypographyVariant.body2
            css {
                color = NamedColor.grey
            }
            +"UtaFormatix © 2015 - 2023　|　"
            Link {
                color = NamedColor.grey
                underline = LinkUnderline.hover
                href = "https://github.com/sdercolin/utaformatix3"
                target = AnchorTarget._blank
                +"GitHub"
            }
            +"　|　"
            Link {
                color = NamedColor.grey
                underline = LinkUnderline.hover
                href = "https://discord.gg/TyEcQ6P73y"
                target = AnchorTarget._blank
                +"Discord"
            }
            +"　|　"
            Link {
                color = NamedColor.grey
                underline = LinkUnderline.hover
                href = "http://vsqx-platform.ysupan.com/"
                +"VSQx分享平台"
            }
            +"　|　"
            Link {
                color = NamedColor.grey
                underline = LinkUnderline.hover
                href = "./ToPinyinAndRomaji/index.html"
                +"拼音&罗马转换"
            }
            +"　|　"
            Link {
                color = NamedColor.grey
                underline = LinkUnderline.hover
                href = "./harm/index.html"
                +"和声生成"
            }
        }
    }
}

external interface CustomFooterProps : Props {
    var onOpenEmbeddedPage: (urlKey: Strings) -> Unit
}
