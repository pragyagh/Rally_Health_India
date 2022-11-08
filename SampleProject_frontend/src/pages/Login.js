import React from 'react';
import { Navigate } from 'react-router-dom';
import LoginForm from '../components/LoginForm';
import { useAuth } from '../utils/auth';

const Login = () => {
  const auth = useAuth()
  if(!auth.user)
  {return (
    <LoginForm/>
  )}
  else{
    return(
      <Navigate to='/search'/>)
}
}

export default Login