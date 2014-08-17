import sbt._
import Keys._

object Common {
  def version = "2.3.1.1"
  def playVersion = System.getProperty("play.version", "2.3.1")
  def scalaVersion =  System.getProperty("scala.version", "2.10.4")
  def crossScalaVersions = Seq("2.10.4", "2.11.0")
}
