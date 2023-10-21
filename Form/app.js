 form = document.getElementById('form');
const firstname = document.getElementById('firstname');
const lastname = document.getElementById('lastname');
const dob = document.getElementById('dob');
const country = document.getElementById('country');
const gender = document.getElementById('gender');
const profession = document.getElementById('profession');
const email = document.getElementById('email');
const mobile = document.getElementById('mobile');

form.addEventListener('submit', function() {
    msg = "\n" + "\n" +
          "First Name: " + firstname.value.trim() + "\n" + 
          "Last Name: " + lastname.value.trim() + "\n" + 
          "Date of Birth: " + dob.value.trim() + "\n" + 
          "Country: " + country.value.trim() + "\n" + 
          "Gender: " + gender.value.trim() + "\n" + 
          "Profession: " + gender.value.trim() + "\n" + 
          "Email: " + email.value.trim() + "\n" +
          "Mobile: " + mobile.value.trim() + "\n";
    alert("Validation successful!" + msg);

    
});



