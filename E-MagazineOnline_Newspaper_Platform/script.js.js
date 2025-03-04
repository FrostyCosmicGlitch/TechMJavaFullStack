let slideIndex = 0; 

function showSlides() {
    const slides = document.querySelectorAll(".slide");
    slides.forEach((slide, index) => {
        slide.style.display = index === slideIndex ? "block" : "none";
    });
}

function nextSlide() {
    const slides = document.querySelectorAll(".slide");
    slideIndex = (slideIndex + 1) % slides.length;
    showSlides();
}

function prevSlide() {
    const slides = document.querySelectorAll(".slide");
    slideIndex = (slideIndex - 1 + slides.length) % slides.length;
    showSlides();
}

document.addEventListener("DOMContentLoaded", function () {
    showSlides();

    document.querySelector(".next").addEventListener("click", nextSlide);
    document.querySelector(".prev").addEventListener("click", prevSlide);

    setInterval(nextSlide, 5000);

    fetch('data/articles.json')
        .then(response => response.json())
        .then(data => displayArticles(data))
        .catch(error => console.error('Failed to fetch articles:', error));
});

function displayArticles(articles) {
    const container = document.getElementById('latest-articles');
    if (!container) return;

    articles.forEach(article => {
        const articleElement = document.createElement('article');
        articleElement.innerHTML = `
            <h3>${article.title}</h3>
            <p>${article.content}</p>
        `;
        container.appendChild(articleElement);
    });
}

