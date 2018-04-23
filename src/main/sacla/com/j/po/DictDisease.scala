package com.j.po

import java.util.Date
import javax.persistence.{Entity, GeneratedValue, GenerationType, Id}

import scala.beans.BeanProperty

/**
  * Created by jufeng on 2018/4/23.
  */


@Entity
class DictDisease {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: Int = _

  @BeanProperty
  var medical: Int = _

  @BeanProperty
  var name: String = _

  @BeanProperty
  var weight: Int = _

  @BeanProperty
  var code: String = _

  @BeanProperty
  var remark: String = _

  @BeanProperty
  var updated: Date = _

  @BeanProperty
  var created: Date = _


}
