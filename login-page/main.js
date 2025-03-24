let loginForm = document.getElementById('login-form');
let registerForm = document.getElementById('register-form');

let noHaveAccountButton = document.getElementById('no-account');
let haveAccountButton = document.getElementById('have-account');

noHaveAccountButton.addEventListener('click', function () {
  loginForm.classList.add('hidden');
  registerForm.classList.remove('hidden');
  
  loginForm.setAttribute("aria-hidden", "true");
  registerForm.setAttribute("aria-hidden", "false");

  document.title = "CleanGo | Register"
});

haveAccountButton.addEventListener('click', function () {
  registerForm.classList.add('hidden');  
  loginForm.classList.remove('hidden');

  registerForm.setAttribute("aria-hidden", "true");
  loginForm.setAttribute("aria-hidden", "false");

  document.title = "CleanGo | Login"
});