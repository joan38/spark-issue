import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

object Streaming {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("Simple Application").setMaster("local[*]")
    val streamingContext = new StreamingContext(sparkConf, Seconds(2))

    val lines = streamingContext.socketTextStream("localhost", 8888)
    lines.print()

    streamingContext.start()
    streamingContext.awaitTermination()
  }
}
