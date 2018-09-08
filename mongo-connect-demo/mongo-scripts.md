[To create a new Database/Document]
use boot-demo;

[To create a new user with specific role]
db.createUser({user:"neeraj", pwd:"abcd1234", roles:[{role:"readWrite", db:"admin"}]});

[To update a new user with admin roles]
db.updateUser( "neeraj", { roles : [ "userAdminAnyDatabase", "dbAdminAnyDatabase", "readWriteAnyDatabase" ]});

[To get the list of collections in currect document]
db.getCollectionNames();

[To get all the data in a collection]
db.clothing.find({});