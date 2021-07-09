package com.whirly.util

import scala.util.Random

object IpHelper {
  var city = List("北京", "上海", "河北", "山东", "河南", "江苏", "广东", "江西", "西藏", "新疆")

  def findRegionByIp(ip: String) = {
    city.apply(new Random().nextInt(10))
  }

}
