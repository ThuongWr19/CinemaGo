document.addEventListener('DOMContentLoaded', function() {
    getMovieList();
});

function getMovieList() {
    const movies_list = document.getElementById("movies-list");
    if (!movies_list) return; // Safety check
    fetch("http://localhost:8080/api/phim")
        .then((response) => response.json())
        .then((data) => {
            data.forEach((movie) => {
                const card = `
                <div class="col">
                    <div class="card text-center h-100">
                        <div class="bg-image hover-overlay ripple" data-mdb-ripple-color="light">
                            <img src="${movie.posterUrl}" class="img-thumbnail" style="height: 500px;" />
                            <a href="#!">
                                <div class="mask" style="background-color: rgba(251, 251, 251, 0.15)"></div>
                            </a>
                        </div>
                        <div class="card-body">
                            <h5 class="card-title">${movie.title}</h5>
                            <p class="card-text">${movie.description}</p>
                            <button type="button" class="btn btn-primary">Trailer</button>
                        </div>
                    </div>
                </div>
                `;
                movies_list.innerHTML += card;
            });
        });
}