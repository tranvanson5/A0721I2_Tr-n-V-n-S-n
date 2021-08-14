let temp = false;

function nhap(input) {
    if (input !== '+' && input !== '-' && input !== '*' && input !== '/') {
        if (temp) {
            xoa();
        }
    }
    temp = false;
    let inp = document.getElementById("inandout");
    inp.value += input;
}

function xoa() {
    let clear = document.getElementById("inandout");
    clear.value = "";
}

function tinhtoan() {
    let cacular = document.getElementById("inandout");
    cacular.value = eval(cacular.value);
    temp = true;
}