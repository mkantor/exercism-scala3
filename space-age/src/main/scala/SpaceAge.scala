object SpaceAge {
    def onEarth(secondsSinceBirth: Double): Double = {
        val secondsInYear = 31557600d
        secondsSinceBirth / secondsInYear
    }

    def onMercury(secondsSinceBirth: Double): Double = {
        val secondsInYear = 7600544d
        secondsSinceBirth / secondsInYear
    }

    def onVenus(secondsSinceBirth: Double): Double = {
        val secondsInYear = 19414149d
        secondsSinceBirth / secondsInYear
    }

    def onMars(secondsSinceBirth: Double): Double = {
        val secondsInYear = 59354033d
        secondsSinceBirth / secondsInYear
    }

    def onJupiter(secondsSinceBirth: Double): Double = {
        val secondsInYear = 374355659d
        secondsSinceBirth / secondsInYear
    }

    def onSaturn(secondsSinceBirth: Double): Double = {
        val secondsInYear = 929292363d
        secondsSinceBirth / secondsInYear
    }

    def onUranus(secondsSinceBirth: Double): Double = {
        val secondsInYear = 2651370019d
        secondsSinceBirth / secondsInYear
    }

    def onNeptune(secondsSinceBirth: Double): Double = {
        val secondsInYear = 5200418560d
        secondsSinceBirth / secondsInYear
    }
}
