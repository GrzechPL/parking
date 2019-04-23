//package com.capgemini.parkingApp.mappers;
//
//import com.capgemini.parkingApp.dto.UserDto;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class UsersMapper {
//
//    public static UserDto toUserDTO(UserEntity userEntity) {
//        if (userEntity == null) {
//            return null;
//        }
//        UserDto userDto = new UserDto();
//        userDto.setId(userEntity.getId());
//        userDto.setE_mail(userEntity.getE_mail());
//        userDto.setNick(userEntity.getNick());
//
//        return userDto;
//    }
//
//    public static List<UserDto> toUserListDTO(List<UserEntity> userEntity) {
//        return userEntity.stream()
//                .map(UsersMapper::toUserDTO)
//                .collect(Collectors.toList());
//    }
//
//    public static UserEntity toUserEntity(UserDto userDto) {
//        if (userDto == null)
//            return null;
//        UserEntity userEntity = new UserEntity();
//        userEntity.setId(userDto.getId());
//        userEntity.setE_mail(userDto.getE_mail());
//        userEntity.setNick(userDto.getNick());
//        return userEntity;
//    }
//
//}