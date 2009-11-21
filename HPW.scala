/** Basic command line parsing. */
import FileHelper._

object HPW {
  var verbose = false

  def main(args: Array[String]) {
    for (a <- args) a match {
      case "-h" | "-help"    =>
        println("Usage: scala Main [-help|-verbose]")
      case "-v" | "-verbose" =>
        verbose = true
      case "-c" | "-clean" =>
	println("TODO: call method to clean out *.class files from FileHelper, with path inparam in args.")
      case x =>
        println("Unknown option: '" + x + "'")
    }
    if (verbose)
      println("How are you today?")
  }
}

