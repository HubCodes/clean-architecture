package entity.account

sealed abstract class LoginPolicy

final case class InHouseLogin(loginID: LoginID, loginPW: String, hashedLoginPW: String) extends LoginPolicy
