package entity.user

final case class LoginID private[account](value: String)

object LoginID {
  private val IDRegex = """[a-zA-Z0-9_]{4,16}""".r

  private def validate(value: String): Boolean = value match {
    case IDRegex(_) => true
    case _ => false
  }

  def of(value: String): Option[LoginID] =
    if (validate(value)) {
      Some(LoginID(value))
    } else {
      None
    }
}
