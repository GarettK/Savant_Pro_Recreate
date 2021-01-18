package edu.utap.savant_pro_recreate

class Repository {
    companion object {
        private var initialDataList = listOf (
            Room("Kitchen",1,0,3,4,"70"),
            Room("Living Room",1,2,3,0,"72"),
            Room("Dining Room",1,2,3,0,"70"),
            Room("Bedroom",1,2,0,0,"68"),
            Room("Garage",2,3,4,0,"54"),
            Room("Attic",2,0,0,0,"62")
                )
    }

    fun fetchRooms(): List<Room> {
        return initialDataList
    }
}