// left - 1
if argument0 = 1 {
    instance_create(x,y,obj_arrow)
    obj_arrow.image_angle = 180
    obj_arrow.dir = 1
}
// right - 2
if argument0 = 2 {
    instance_create(x,y,obj_arrow)
    obj_arrow.image_angle = 0
    obj_arrow.dir = 2
}
// down - 3
if argument0 = 3 {
    instance_create(x,y,obj_arrow)
    obj_arrow.image_angle = 270
    obj_arrow.dir = 3
}
//up - 4
if argument0 = 4 {
    instance_create(x,y,obj_arrow)
    obj_arrow.image_angle = 90
    obj_arrow.dir = 4
}
