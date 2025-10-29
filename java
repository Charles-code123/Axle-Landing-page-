// Modal functions
function openModal(type) {
    document.getElementById(type + 'Modal').classList.add('active');
}

function closeModal(type) {
    document.getElementById(type + 'Modal').classList.remove('active');
}

// FAQ toggle
function toggleFAQ(element) {
    const item = element.parentElement;
    item.classList.toggle('active');
    const symbol = element.querySelector('span');
    symbol.textContent = item.classList.contains('active') ? '−' : '+';
}

// Form submission
function handleFormSubmit(event, type) {
    event.preventDefault();

    // Collect form data
    const formData = {};
    const form = event.target;
    const inputs = form.querySelectorAll('input, select, textarea');

    inputs.forEach(input => {
        if (input.value) {
            formData[input.id] = input.value;
        }
    });

    // Log to console (replace with actual API call)
    console.log('Form submitted:', type, formData);

    // Save to localStorage
    const leads = JSON.parse(localStorage.getItem('axle_leads') || '[]');
    leads.push({
        type: type,
        timestamp: new Date().toISOString(),
        data: formData
    });
    localStorage.setItem('axle_leads', JSON.stringify(leads));

    // Show success message
    alert('Thank you! We\'ll be in touch within 24 hours.');

    // Close modal and reset form
    closeModal(type);
    form.reset();
}

// Close modal when clicking outside
window.onclick = function(event) {
    // Check if the clicked element has the class 'modal' (the dark overlay)
    if (event.target.classList.contains('modal')) {
        event.target.classList.remove('active');
    }
}
