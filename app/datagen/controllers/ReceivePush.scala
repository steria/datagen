package datagen.controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.functional.syntax._

object ReceivePush extends Controller {
  def data = Action { request =>
    println("RECEIVER: Got new batch of data to receivePush:")
    Thread.sleep(100)
    //println(request.body)
    //request.body.asJson.map{x =>println("some data:"+x.toString.substring(100)+ "some")}
    println("RECEIVER: End batch of data")
    Ok("")
  }
}