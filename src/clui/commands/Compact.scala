package sbaz.clui.commands

object Compact extends Command {
  val name = "compact"
  val oneLineHelp = "clear the download cache to save space"
  val fullHelp: String = (
    "compact\n" +
    "\n" +
    "Compact the managed directory.  Removes all cached downloads.\n")



  def run(args: List[String], settings: Settings) = {
    import settings._

    Console.println("not yet implemented")
    //XXX umm, just remove cache, right?
  }
}
