const fileInput = document.getElementById('fileInput');
const allowedExtensions = ['pdf', 'doc', 'docx', 'jpeg', 'jpg', 'png'];

fileInput.addEventListener('change', () => {
    const selectedFiles = fileInput.files;
    for (let i = 0; i < selectedFiles.length; i++) {
        const file = selectedFiles[i];
        const fileExtension = file.name.split('.').pop().toLowerCase();
        if (!allowedExtensions.includes(fileExtension)) {
            alert('Por favor, selecione apenas arquivos PDF, DOC, DOCX, JPEG ou PNG.');
            fileInput.value = ''; // Limpa o input para evitar envio de arquivos não permitidos
            return;
        }
    }
});