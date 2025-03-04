interface Article {
    title: string;
    content: string;
}

fetch('../data/articles.json')
    .then(response => response.json())
    .then((data: Article[]) => displayArticles(data))
    .catch(error => console.error('Failed to fetch articles:', error));

function displayArticles(articles: Article[]) {
    const container = document.getElementById('latest-articles') as HTMLElement | null;
    if (!container) {
        console.error('Error: latest-articles section not found.');
        return;
    }

    articles.forEach(article => {
        const articleElement = document.createElement('article');
        articleElement.innerHTML = `
            <h3>${article.title}</h3>
            <p>${article.content}</p>
        `;
        container.appendChild(articleElement);
    });
}

document.addEventListener("DOMContentLoaded", function () {
    const slider = document.querySelector('.slider') as HTMLElement | null;
    if (slider) {
        setInterval(() => {
            slider.scrollLeft += 300;
            if (slider.scrollLeft >= slider.scrollWidth - slider.clientWidth) {
                slider.scrollLeft = 0;
            }
        }, 3000);
    }
});

