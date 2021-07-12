package com.whirly

object Constants {
  val projectPath = "/Users/hounaikuo/Documents/project/BigData-In-Practice/ImoocLogAnalysis"
  val protocol = "file:///"
  val rawPath = projectPath + "/data/imooc-log/access.1w.log" // 原始数据
  val tempOut = projectPath + "/data/imooc-log/tempClean" // 第一步清洗
  val cleanedIn = tempOut + "/part-*" // 第二次清洗的输入路径
  val cleanedOut = projectPath + "/data/imooc-log/cleaned" // 清洗完毕后
  val cleanedCsv = projectPath + "/data/imooc-log/cleanedCsv"
}
