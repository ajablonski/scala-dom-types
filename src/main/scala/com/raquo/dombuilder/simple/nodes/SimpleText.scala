package com.raquo.dombuilder.simple.nodes

import com.raquo.dombuilder.domapi.{NodeApi, TextApi}
import com.raquo.dombuilder.nodes.{ChildNode, Text}
import com.raquo.dombuilder.simple
import org.scalajs.dom

class SimpleText(override protected[this] var _text: String)
  extends SimpleNode
  with Text[SimpleNode, dom.Text, dom.Node]
  with ChildNode[SimpleNode, dom.Text, dom.Node]
{
  override val nodeApi: NodeApi[SimpleNode, dom.Node] = simple.nodeApi

  override val textNodeApi: TextApi[SimpleNode, dom.Text] = simple.textNodeApi
}
