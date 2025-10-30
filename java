/* ------------------------------------------- */
/* 1. Global Reset, Variables, and Typography  */
/* ------------------------------------------- */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

:root {
    /* Color Palette */
    --anchor-blue: #2F5C8F; /* Deep Blue Anchor */
    --accent-turq: #4cbfa6; /* Turquoise Accent (Primary CTA/Highlight) */
    --accent-mandarin: #FF894C; /* Mandarin Accent (Secondary CTA/Icon) */
    --dark-bg: #141f33; /* Dark background for Hero/Footer (Holographic feel) */
    --light-bg: #f8faff; /* Barely-there gray for sections */
    --white: #ffffff;
    --gray-text: #6b7280;
    
    /* Global Styles */
    --border-radius: 12px;
}

body {
    /* Geometric Sans-serif Font */
    font-family: 'Inter', sans-serif;
    line-height: 1.6;
    color: var(--anchor-blue);
    background-color: var(--white);
    overflow-x: hidden;
}

/* Ensure Inter font is loaded */
@import url('https://fonts.googleapis.com/css2?family=Inter:wght@100..900&display=swap');

.container {
    max-width: 1200px;
    margin: 0 auto;
    padding: 0 2rem;
}

section {
    padding: 6rem 0; /* Increased padding */
}

h1, h2, h3 {
    font-family: 'Inter', sans-serif; /* Use geometric font for headings */
    font-weight: 800;
}

h2 {
    font-size: 2.8rem;
    color: var(--anchor-blue);
    margin-bottom: 4rem;
    text-align: center;
}

/* ------------------------------------------- */
/* 2. Navigation and CTAs                       */
/* ------------------------------------------- */
nav {
    position: sticky; /* Sticky Nav */
    top: 0;
    width: 100%;
    background: rgba(255, 255, 255, 0.98);
    box-shadow: 0 4px 12px rgba(0,0,0,0.08); /* Deeper shadow */
    z-index: 1000;
    padding: 1rem 2rem;
}

.nav-links a {
    color: var(--gray-text);
    font-weight: 600;
    transition: color 0.3s;
}

.nav-links a:hover {
    color: var(--accent-turq);
}

/* Base Button Style */
.btn {
    padding: 0.85rem 1.8rem;
    border: none;
    border-radius: var(--border-radius);
    font-weight: 700;
    cursor: pointer;
    transition: all 0.3s cubic-bezier(0.25, 0.46, 0.45, 0.94);
    text-decoration: none;
    display: inline-block;
}

/* Primary Button (Turquoise Accent) */
.btn-primary {
    background: var(--accent-turq);
    color: var(--dark-bg);
    box-shadow: 0 5px 15px rgba(76, 191, 166, 0.4);
}

.btn-primary:hover {
    background: #39a68e;
    transform: translateY(-3px);
    box-shadow: 0 8px 20px rgba(76, 191, 166, 0.6);
}

/* Secondary/Outline Button (Mandarin Accent) */
.btn-outline {
    background: transparent;
    color: var(--accent-mandarin);
    border: 2px solid var(--accent-mandarin);
}

.btn-outline:hover {
    background: var(--accent-mandarin);
    color: var(--white);
    box-shadow: 0 5px 15px rgba(255, 137, 76, 0.4);
}

/* Floating CTA Container (Bottom Right) */
.floating-cta-container {
    position: fixed;
    bottom: 2rem;
    right: 2rem;
    z-index: 999;
    display: flex;
    flex-direction: column;
    gap: 0.75rem;
    opacity: 0.9;
}

/* ------------------------------------------- */
/* 3. Hero Section (Holographic/Dark Feel)     */
/* ------------------------------------------- */
.hero {
    background: var(--dark-bg); /* Dark blue background */
    color: var(--white);
    position: relative;
    height: 90vh; /* Slightly reduced height */
    display: flex;
    align-items: center;
    justify-content: center;
    text-align: center;
    overflow: hidden;
}

.hero h1 {
    font-size: 5rem; /* Bigger, bolder heading */
    font-weight: 900;
    line-height: 1.1;
    text-shadow: 0 0 15px rgba(0, 0, 0, 0.8);
}

.hero h1 .highlight {
    color: var(--accent-turq); /* Turquoise highlight */
    text-shadow: 0 0 25px rgba(76, 191, 166, 0.8); /* Glow effect */
}

.hero p {
    font-weight: 300;
}

/* Stats Styling */
.stat-number {
    font-size: 2.5rem;
    font-weight: 900;
    color: var(--accent-mandarin); /* Mandarin for high-impact numbers */
    text-shadow: 0 0 5px rgba(255, 137, 76, 0.5);
}

.stat-label {
    font-weight: 600;
}


/* ------------------------------------------- */
/* 4. Modular Content (Cards)                  */
/* ------------------------------------------- */

/* Trusted By */
.trusted-by {
    background: var(--light-bg);
}

.logo-box {
    border-radius: var(--border-radius);
    box-shadow: 0 4px 10px rgba(0,0,0,0.05);
    font-weight: 700;
    border: 1px solid #e0e7ff; /* Subtle border for definition */
}

/* Value Cards */
.value-card {
    padding: 2.5rem;
    border-radius: var(--border-radius);
    box-shadow: 0 8px 20px rgba(0,0,0,0.1);
    border-top: 5px solid var(--accent-turq); /* Color-coded top border */
    transition: transform 0.3s, box-shadow 0.3s;
}

.value-card:hover {
    transform: translateY(-8px); /* Deeper lift */
    box-shadow: 0 15px 30px rgba(0,0,0,0.15);
}

.value-card h3 {
    color: var(--anchor-blue);
}

/* Pricing Cards */
.pricing-card {
    border-radius: var(--border-radius);
    box-shadow: 0 8px 20px rgba(0,0,0,0.1);
    border: 1px solid #e0e7ff;
}

.pricing-card.popular {
    /* Most Popular Highlight - using a subtle gradient border effect */
    border: none;
    background: linear-gradient(to bottom right, var(--white) 98%, var(--accent-turq) 100%);
    box-shadow: 0 0 25px rgba(76, 191, 166, 0.4);
}

.popular-badge {
    background: var(--accent-mandarin); /* Use Mandarin for the badge */
    border-radius: 20px 20px 0 0; /* Squared bottom corners for better card integration */
    padding: 0.75rem 1.5rem;
}

.price {
    color: var(--accent-turq); /* Pricing numbers stand out */
    font-weight: 900;
}

.features-list li:before {
    color: var(--accent-mandarin); /* Checkmarks in Mandarin */
    font-weight: 900;
}

/* How It Works Steps */
.step-number {
    background: var(--accent-mandarin); /* Mandarin for step numbers */
    box-shadow: 0 5px 10px rgba(255, 137, 76, 0.5);
}

/* Testimonial Section */
.testimonial {
    background: var(--dark-bg); 
    color: var(--white);
    padding: 6rem 0; 
}

.testimonial h2 {
    color: var(--white); 
    margin-bottom: 4rem;
}

.testimonial-content {
    background: rgba(47, 92, 143, 0.3); /* Transparent dark blue background */
    padding: 3rem;
    border-radius: var(--border-radius);
    box-shadow: inset 0 0 20px rgba(76, 191, 166, 0.2), 0 0 20px rgba(0,0,0,0.4); /* Subtle glassmorphism/glow */
}

.testimonial-content blockquote {
    font-size: 1.6rem;
    font-weight: 300;
    font-style: italic;
    color: var(--white);
}

.testimonial-author {
    font-weight: 600;
    color: var(--accent-turq);
    border-top: 1px solid rgba(76, 191, 166, 0.4);
}

/* ------------------------------------------- */
/* 5. Footer and Modals                       */
/* ------------------------------------------- */
.cta-section {
    background: linear-gradient(135deg, var(--anchor-blue) 0%, var(--dark-bg) 100%);
}

.cta-section h2 {
    color: var(--white);
}

footer {
    background: var(--dark-bg);
}

.footer-section h4 {
    color: var(--accent-turq);
}

.footer-section a:hover {
    color: var(--accent-mandarin);
}

/* Modal form style adjustments */
input:focus, select:focus, textarea:focus {
    border-color: var(--accent-turq);
    box-shadow: 0 0 0 3px rgba(76, 191, 166, 0.2);
}

/* ------------------------------------------- */
/* 6. Responsive and Mobile Nav                */
/* ------------------------------------------- */
/* Hamburger styles inherited from previous step */
.hamburger {
    display: none; 
    background: transparent;
    border: none;
    cursor: pointer;
    padding: 0.5rem;
    z-index: 1010;
}

.hamburger span {
    display: block;
    width: 25px;
    height: 3px;
    margin: 5px 0;
    background: var(--anchor-blue); /* Changed to use Anchor Blue */
    transition: all 0.3s ease-in-out;
}

.hamburger.active span:nth-child(1) {
    transform: rotate(-45deg) translate(-5px, 6px);
}

.hamburger.active span:nth-child(2) {
    opacity: 0;
}

.hamburger.active span:nth-child(3) {
    transform: rotate(45deg) translate(-5px, -6px);
}


@media (max-width: 1024px) {
    .floating-cta-container {
        right: 1rem;
        bottom: 1rem;
    }
}

@media (max-width: 768px) {
    h1 { font-size: 3rem; }
    h2 { font-size: 2rem; }
    .hero { height: auto; padding: 10rem 0 5rem; }
    .hero h1 { font-size: 3.5rem; }
    
    /* Mobile Nav Overrides */
    .hamburger {
        display: block;
    }
    
    .nav-links {
        position: fixed;
        top: 0;
        right: 0;
        height: 100vh;
        width: 70%;
        max-width: 250px;
        background: var(--white);
        flex-direction: column;
        padding-top: 5rem;
        box-shadow: -2px 0 10px rgba(0,0,0,0.1);
        transform: translateX(100%); 
        transition: transform 0.3s ease-in-out;
    }

    .nav-links.active {
        transform: translateX(0);
    }
    
    .nav-links li {
        width: 100%;
        text-align: left;
        padding: 0.75rem 2rem;
    }
    
    .nav-links a {
        color: var(--anchor-blue);
    }
    
    .nav-cta {
        display: none;
    }
    
    .testimonial-content blockquote {
        font-size: 1.25rem;
    }
}

