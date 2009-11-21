import java.io._
class FileHelper(file : File) {
  def deleteAll : Unit = {
    
  def deleteFile(dfile : File) : Unit = {
	if(dfile.isDirectory){
		val files = dfile.listFiles
		if(files != null)
		files.foreach{ f => deleteFile(f) }
	}
	dfile.delete
  } 

}
object FileHelper{
  implicit def file2helper(file : File) = new FileHelper(file)
}

