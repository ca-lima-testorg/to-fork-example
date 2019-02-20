static Map call() {
    [
        jenkins: [
            node: [
                label: 'somelabel'
            ]
        ],
        github: [
            url: 'https://some.domain.com/api/v3',
            user: [
                credentialId: '<ID_OF_USER_CREDENTIAL>'
            ],
            token: [
                credentialId: '<ID_OF_TOKEN_CREDENTIAL>'
            ]
        ]
    ]
}
