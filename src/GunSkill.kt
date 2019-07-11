class GunSkill: weaponSkill{

    val gun = Gun()

    override fun attack() {
        gun.loadingBullets()
        gun.buckleMachine()
    }
}