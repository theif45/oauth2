import React from "react";
import { useSearchParams } from "react-router-dom";

const OAuth2Login = () => {
    const [searchParams, setSearchParams] = useSearchParams();
    const accessToken = searchParams.get("accessToken");

    if (!!accessToken) {
        localStorage.setItem("accessToken", accessToken);
        window.location.replace("/");
    }

    return <></>;
};

export default OAuth2Login;
