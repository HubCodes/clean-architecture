package entity.account

sealed trait LoginPolicy

final case class InHouseLogin(loginID: LoginID, loginPW: String, hashedLoginPW: String) extends LoginPolicy
