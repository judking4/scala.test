package scala.test

/**
 * Created by jasonzhu on 30/1/15.
 */

abstract class Tree

case class Sum(l:Tree, r: Tree) extends Tree
case class Var(n: String) extends Tree
case class Const(v: Int) extends Tree




