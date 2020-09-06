

export const getAllAuthors = async () => {
    const payload = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
            'Accept': 'application/json',
        },
        body: JSON.stringify({query: "{ findAllAuthors { id firstName country emailId} }"})
    };

    const result = await fetch("/library/graphql", payload)
        .then(r => r.json());
    return result?.data?.findAllAuthors;
};