class BowSkill:weaponSkill{
    val bow = Bow()
    override fun attack() {
        bow.putOnArrow()
        bow.fullBow()
        bow.lunchArrow()
    }

}