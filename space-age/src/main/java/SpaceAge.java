class SpaceAge {
//    Earth: orbital period 365.25 Earth days, or 31557600 seconds
//    Mercury: orbital period 0.2408467 Earth years
//    Venus: orbital period 0.61519726 Earth years
//    Mars: orbital period 1.8808158 Earth years
//    Jupiter: orbital period 11.862615 Earth years
//    Saturn: orbital period 29.447498 Earth years
//    Uranus: orbital period 84.016846 Earth years
//    Neptune: orbital period 164.79132 Earth years

    double timeinseconds;
    SpaceAge(double seconds) {
        this.timeinseconds = seconds;
    }

    double getSeconds() {
        return this.timeinseconds;
    }

    double onEarth() {
        return this.timeinseconds/31555695.8030925;
    }

    double onMercury() {
        return this.timeinseconds/7600525.80461407;
    }

    double onVenus() {
        return this.timeinseconds/19411026.1758691;
    }

    double onMars() {
        return this.timeinseconds/59359776.7898089;
    }

    double onJupiter() {
        return this.timeinseconds/374222565.145228;
    }

    double onSaturn() {
        return this.timeinseconds/928792569.659443;
    }

    double onUranus() {
        return this.timeinseconds/2652994591.73554;
    }

    double onNeptune() {
        return this.timeinseconds/5196280668.35443;
    }

}
