val User.formattedName: String
    get() {
        return if (lastName != null) {
            if (firstName != null) {
                "$firstName $lastName"
            } else {
                lastName ?: "Unknown"
            }
        } else {
            firstName ?: "Unknown"
        }
    }

object Repository {
    private val _users = mutableListOf<User>()
    val users: List<User>
        get() = _users


    val formattedUserNames: List<String>
        get() {
            return _users.map { user ->
                user.formattedName


            }
        }


    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")

        _users.apply {
            // this == _users
            add(user1)
            add(user2)
            add(user3)
        }
    }
}