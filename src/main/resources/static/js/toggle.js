var users = [
    { name: "Alice", 
        age: 30, 
        image: "/images/image.png" },
    { name: "Bob", age: 25, image: "/images/image-2.png" },
    //{ name: "Charlie", age: 35, image: "/images/4.jpg" }
];

var id=1;
function toggle() {
    id=(id+1)%2;
    var temp= users[id];
    document.getElementById("user").innerHTML = temp.name;
    document.getElementById("age").innerHTML = temp.age;
    document.getElementById("userImg").src = temp.image;
}
