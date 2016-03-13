package kroma

class Album {
    String title
    static hasMany = [songs:Song]

    static constraints = {
    }
}
