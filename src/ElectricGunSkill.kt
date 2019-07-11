class ElectricGunSkill: weaponSkill{

    val gun = ElectricGun()

    override fun attack() {
        gun.fullingElectric()
        gun.buckleMachine()
    }
}