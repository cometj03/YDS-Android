package com.yourssu.design.system.foundation

import com.yourssu.design.R

/**
 * Basic Color 는 YDS 개발자가 사용하는 컬러
 * 정확히는 Semantic Color 의 기반이 되는 팔레트이다
 */

data class Color(
    val colorName: String,
    val colorValue: String,
    val color: Int
)

data class ColorCategory(
    val groupName: String,
    val colorList: List<Color>
)

val basicColors = listOf<ColorCategory>(
    ColorCategory("GroupName", listOf(
        Color("colorName", "lightValue / darkValue", R.color.transparent)
    )),
    ColorCategory("Logo", listOf(
        Color("logoIndigo", "#4E5986", R.drawable.logoIndigo),
        Color("logoViolet", "#8969AC", R.drawable.logoViolet),
        Color("logoBlue", "#1653DB", R.drawable.logoBlue),
        Color("logoYellow", "#FFC441", R.drawable.logoYellow)
    )),
    ColorCategory("pointColor", listOf(
        Color("pointColor050", "#E1F2FE / #27233E", R.drawable.pointColor050),
        Color("pointColor100", "#B6DDFE / #433A74", R.drawable.pointColor100),
        Color("pointColor200", "#86C8FE / #544895", R.drawable.pointColor200),
        Color("pointColor300", "#4EB2FE / #6556B5", R.drawable.pointColor300),
        Color("pointColor400", "#00A3FF / #816DEC", R.drawable.pointColor400),
        Color("pointColor500", "#0092FE / #9380E8", R.drawable.pointColor500),
        Color("pointColor600", "#0084F0 / #A797F0", R.drawable.pointColor600),
        Color("pointColor700", "#0072DD / #B2A4EF", R.drawable.pointColor700),
        Color("pointColor800", "#0060CB / #CBC1F6", R.drawable.pointColor800),
        Color("pointColor900", "#0042AB / #EBE6FB", R.drawable.pointColor900),
        Color("pointColorA20", "#33816DEC (#816DEC, 20%)", R.drawable.pointColorA20)
    )),
    ColorCategory("WarningRed", listOf(
        Color("warningRed050", "#FFECEF / #401E1F", R.drawable.warningRed050),
        Color("warningRed100", "#FFCED4 / #5F2627", R.drawable.warningRed100),
        Color("warningRed200", "#F99C9D / #A93B3B", R.drawable.warningRed200),
        Color("warningRed300", "#F37476 / #C74445", R.drawable.warningRed300),
        Color("warningRed400", "#FF5252 / #FF5252", R.drawable.warningRed400),
        Color("warningRed500", "#FF3E36 / #FF5E5E", R.drawable.warningRed500),
        Color("warningRed600", "#F73536 / #F37476", R.drawable.warningRed600),
        Color("warningRed700", "#E42930 / #F99C9D", R.drawable.warningRed700),
        Color("warningRed800", "#D72028 / #FFCED4", R.drawable.warningRed800),
        Color("warningRed900", "#C8111C / #FFECEF", R.drawable.warningRed900),
    )),
    ColorCategory("White & Black", listOf(
        Color("white000", "#FFFFFF / #FFFFFF", R.drawable.white000),
        Color("black000", "#101112 / #101112", R.drawable.black000),
        Color("realBlack", "#000000", R.drawable.realBlack),
    )),
    ColorCategory("Gray", listOf(
        Color("gray050", "#F8F9FA / #1A1B1C", R.drawable.gray050),
        Color("gray100", "#F3F5F7 / #1D1E1F", R.drawable.gray100),
        Color("gray200", "#ECEEF0 / #202122", R.drawable.gray200),
        Color("gray300", "#E2E5E8 / #2A2B2C", R.drawable.gray300),
        Color("gray400", "#D4D8DC / #373839", R.drawable.gray400),
        Color("gray500", "#B5B9BD / #5D5E5F", R.drawable.gray500),
        Color("gray600", "#8E9398 / #848586", R.drawable.gray600),
        Color("gray700", "#505458 / #BEBFC0", R.drawable.gray700),
        Color("gray800", "#3A3D40 / #E1E2E3", R.drawable.gray800),
        Color("gray900", "#252729 / #F8F9FA", R.drawable.gray900),
    )),
    ColorCategory("WB Alpha", listOf(
        Color("white000A5", "#0DFFFFFF", R.drawable.white000A5),
        Color("white000A10", "#1AFFFFFF", R.drawable.white000A10),
        Color("white000A30", "#4DFFFFFF", R.drawable.white000A30),
        Color("white000A70", "#B3FFFFFF", R.drawable.white000A70),
        Color("black000A5", "#0D101112", R.drawable.black000A5),
        Color("black000A10", "#1A101112", R.drawable.black000A10),
        Color("black000A30", "#4D101112", R.drawable.black000A30),
        Color("black000A70", "#B3101112", R.drawable.black000A70),
        Color("gray900A5", "#0D252729", R.drawable.gray900A5),
        Color("gray900A30", "#4D252729", R.drawable.gray900A30),
        Color("gray900A70", "#B3252729", R.drawable.gray900A70),
    )),
    ColorCategory("Pink", listOf(
        Color("pink050", "#FDE6F4", R.drawable.pink050),
        Color("pink100", "#FBC1E5", R.drawable.pink100),
        Color("pink200", "#FC98D3", R.drawable.pink200),
        Color("pink300", "#FF6CBF", R.drawable.pink300),
        Color("pink400", "#FF47AD", R.drawable.pink400),
        Color("pink500", "#FF1F99", R.drawable.pink500),
        Color("pink600", "#F21F93", R.drawable.pink600),
        Color("pink700", "#DA1F8B", R.drawable.pink700),
        Color("pink800", "#C31F85", R.drawable.pink800),
    )),
    ColorCategory("Red", listOf(
        Color("red050", "#FFEBEE", R.drawable.red050),
        Color("red100", "#FFCDD2", R.drawable.red100),
        Color("red200", "#EF9A9A", R.drawable.red200),
        Color("red300", "#E57373", R.drawable.red300),
        Color("red400", "#EF5350", R.drawable.red400),
        Color("red500", "#F44236", R.drawable.red500),
        Color("red600", "#E53835", R.drawable.red600),
        Color("red700", "#D32E2F", R.drawable.red700),
        Color("red800", "#C62728", R.drawable.red800),
    )),
    ColorCategory("Orange", listOf(
        Color("orange050", "#FFF1E4", R.drawable.orange050),
        Color("orange100", "#FFDBBC", R.drawable.orange100),
        Color("orange200", "#FFC492", R.drawable.orange200),
        Color("orange300", "#FFAC6C", R.drawable.orange300),
        Color("orange400", "#FD9A55", R.drawable.orange400),
        Color("orange500", "#FC8A46", R.drawable.orange500),
        Color("orange600", "#F67F44", R.drawable.orange600),
        Color("orange700", "#EE7141", R.drawable.orange700),
        Color("orange800", "#E6623E", R.drawable.orange800),
    )),
    ColorCategory("Yellow", listOf(
        Color("yellow050", "#FFF8DC", R.drawable.yellow050),
        Color("yellow100", "#FFF0AB", R.drawable.yellow100),
        Color("yellow200", "#FFE672", R.drawable.yellow200),
        Color("yellow300", "#FFDC3A", R.drawable.yellow300),
        Color("yellow400", "#FFD200", R.drawable.yellow400),
        Color("yellow500", "#FBC000", R.drawable.yellow500),
        Color("yellow600", "#F6B000", R.drawable.yellow600),
        Color("yellow700", "#E1A714", R.drawable.yellow700),
        Color("yellow800", "#CC9200", R.drawable.yellow800),
    )),
    ColorCategory("Lime", listOf(
        Color("lime050", "#F9FBE7", R.drawable.lime050),
        Color("lime100", "#F0F4C3", R.drawable.lime100),
        Color("lime200", "#E5EE9C", R.drawable.lime200),
        Color("lime300", "#DBE775", R.drawable.lime300),
        Color("lime400", "#D3E157", R.drawable.lime400),
        Color("lime500", "#CCDC39", R.drawable.lime500),
        Color("lime600", "#BFCA33", R.drawable.lime600),
        Color("lime700", "#AEB42B", R.drawable.lime700),
        Color("lime800", "#9D9D24", R.drawable.lime800),
    )),
    ColorCategory("Green", listOf(
        Color("green050", "#E5F9EE", R.drawable.green050),
        Color("green100", "#BFF0D5", R.drawable.green100),
        Color("green200", "#93E7BB", R.drawable.green200),
        Color("green300", "#5BDE9F", R.drawable.green300),
        Color("green400", "#0BD588", R.drawable.green400),
        Color("green500", "#00CC74", R.drawable.green500),
        Color("green600", "#00BB68", R.drawable.green600),
        Color("green700", "#00A85B", R.drawable.green700),
        Color("green800", "#00964F", R.drawable.green800),
    )),
    ColorCategory("Emerald", listOf(
        Color("emerald050", "#E0F8F7", R.drawable.emerald050),
        Color("emerald100", "#B3ECEA", R.drawable.emerald100),
        Color("emerald200", "#82E0DF", R.drawable.emerald200),
        Color("emerald300", "#51D2D4", R.drawable.emerald300),
        Color("emerald400", "#2BC9CC", R.drawable.emerald400),
        Color("emerald500", "#00BFC7", R.drawable.emerald500),
        Color("emerald600", "#00AFB5", R.drawable.emerald600),
        Color("emerald700", "#069A9C", R.drawable.emerald700),
        Color("emerald800", "#088585", R.drawable.emerald800),
    )),
    ColorCategory("Aqua", listOf(
        Color("aqua050", "#E0F4FD", R.drawable.aqua050),
        Color("aqua100", "#B2E3FA", R.drawable.aqua100),
        Color("aqua200", "#7FD0F7", R.drawable.aqua200),
        Color("aqua300", "#4CBEF3", R.drawable.aqua300),
        Color("aqua400", "#26B0F1", R.drawable.aqua400),
        Color("aqua500", "#00A2EE", R.drawable.aqua500),
        Color("aqua600", "#0095DF", R.drawable.aqua600),
        Color("aqua700", "#0182CB", R.drawable.aqua700),
        Color("aqua800", "#0171B7", R.drawable.aqua800),
    )),
    ColorCategory("Blue", listOf(
        Color("blue050", "#E4F1FA", R.drawable.blue050),
        Color("blue100", "#BEDCF3", R.drawable.blue100),
        Color("blue200", "#98C6EC", R.drawable.blue200),
        Color("blue300", "#74B0E2", R.drawable.blue300),
        Color("blue400", "#489AE7", R.drawable.blue400),
        Color("blue500", "#4B90D7", R.drawable.blue500),
        Color("blue600", "#4582CA", R.drawable.blue600),
        Color("blue700", "#3C71B8", R.drawable.blue700),
        Color("blue800", "#3661A5", R.drawable.blue800),
    )),
    ColorCategory("Indigo", listOf(
        Color("indigo050", "#E8EAF6", R.drawable.indigo050),
        Color("indigo100", "#C5CAE9", R.drawable.indigo100),
        Color("indigo200", "#9FA8DA", R.drawable.indigo200),
        Color("indigo300", "#7986CB", R.drawable.indigo300),
        Color("indigo400", "#5C6CC0", R.drawable.indigo400),
        Color("indigo500", "#3F52B5", R.drawable.indigo500),
        Color("indigo600", "#394AAB", R.drawable.indigo600),
        Color("indigo700", "#2F409F", R.drawable.indigo700),
        Color("indigo800", "#273693", R.drawable.indigo800),
    )),
    ColorCategory("Violet", listOf(
        Color("violet050", "#EDE7F6", R.drawable.violet050),
        Color("violet100", "#D1C4E9", R.drawable.violet100),
        Color("violet200", "#B39DDB", R.drawable.violet200),
        Color("violet300", "#9575CD", R.drawable.violet300),
        Color("violet400", "#7E57C2", R.drawable.violet400),
        Color("violet500", "#673AB7", R.drawable.violet500),
        Color("violet600", "#5E35B1", R.drawable.violet600),
        Color("violet700", "#512DA8", R.drawable.violet700),
        Color("violet800", "#4527A0", R.drawable.violet800),
    )),
    ColorCategory("Purple", listOf(
        Color("purple050", "#F2E5F5", R.drawable.purple050),
        Color("purple100", "#DFBFE7", R.drawable.purple100),
        Color("purple200", "#CA95D8", R.drawable.purple200),
        Color("purple300", "#B56CC8", R.drawable.purple300),
        Color("purple400", "#A54DBB", R.drawable.purple400),
        Color("purple500", "#9632AF", R.drawable.purple500),
        Color("purple600", "#882EA9", R.drawable.purple600),
        Color("purple700", "#7629A0", R.drawable.purple700),
        Color("purple800", "#652597", R.drawable.purple800),
    )),
    ColorCategory("Brown", listOf(
        Color("brown050", "#EFEBE9", R.drawable.brown050),
        Color("brown100", "#D7CCC8", R.drawable.brown100),
        Color("brown200", "#BCAAA4", R.drawable.brown200),
        Color("brown300", "#A1887F", R.drawable.brown300),
        Color("brown400", "#8D6E63", R.drawable.brown400),
        Color("brown500", "#795548", R.drawable.brown500),
        Color("brown600", "#6D4C41", R.drawable.brown600),
        Color("brown700", "#5D4037", R.drawable.brown700),
        Color("brown800", "#4E342E", R.drawable.brown800),
    )),
)