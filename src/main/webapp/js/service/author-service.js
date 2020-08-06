

export const getAllAuthors = async () => {
    // const query = JSON.stringify('{↵  findAllAuthors {↵    id↵    firstName↵    age}}');
    const result = await fetch("/graphql", {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
            'Accept': 'application/json',
        },
        body: JSON.stringify({query: "{ findAllAuthors { id firstName country emailId} }"})
    }).then(r => r.json());

    return result.data["findAllAuthors"];
};