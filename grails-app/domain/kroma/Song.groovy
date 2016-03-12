package kroma

class Song {
    String title
    String artist

    static constraints = {
        title blank: false
        artist blank: false
    }
}
