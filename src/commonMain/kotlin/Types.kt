class XmlNode {
    lateinit var tag: String
    lateinit var sub: Array<Sub>
    lateinit var keys: Map<String,String>
    var close: Boolean = false

    class Sub {
        val stringValue: String?
        val nodeValue: XmlNode?
        fun isString() = stringValue != null
        fun isNode() = nodeValue != null
        constructor(value: String) {
            stringValue = value
            nodeValue = null
        }
        constructor(value: XmlNode) {
            nodeValue = value
            stringValue = null
        }
    }
}

class XmlDoc {
    lateinit var type: String
    lateinit var root: Array<XmlNode>
}

