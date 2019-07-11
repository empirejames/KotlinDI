class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val weaponSkill = ElectricGunSkill()
            val shooter = NewShotter(weaponSkill)
            shooter.attack()
        }
    }
}

